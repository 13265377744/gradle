package haday.demo.config;

import javax.sql.DataSource;

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

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 上午11:08:05
 */

@Configuration
@MapperScan(basePackages = "haday.demo.mapper.third", sqlSessionTemplateRef = "thirdSqlSessionTemplate")
public class ThridDruidConfig {

	/**
	 * 获取映射文件所在的路径
	 */
	@Value("${mybatis.third.mapper-locations}")
	private String thirdMapperPath;

	@Bean(name = "thirdDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.third")
	public DataSource setDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Bean(name = "thirdTransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("thirdDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "thirdSqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("thirdDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(thirdMapperPath));
		return bean.getObject();
	}

	@Bean(name = "thirdSqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("thirdSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
