package gradle.master.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Description: 项目计息
 * @Author: dingj
 * @TIME: 2019/11/8 - 9:21
 */
@Configuration
@MapperScan(basePackages = "haday.demo.mapper.fourth", sqlSessionTemplateRef = "fourthSqlSessionTemplate")
public class FourthDruidConfig {

	/**
	 * 获取映射文件所在的路径
	 */
	@Value("${mybatis.fourth.mapper-locations}")
	private String fourthMapperPath;

	@Bean(name = "fourthDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.fourth")
	public DataSource setDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "fourthTransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("fourthDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "fourthSqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("fourthDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(fourthMapperPath));
		return bean.getObject();
	}

	@Bean(name = "fourthSqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("fourthSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
