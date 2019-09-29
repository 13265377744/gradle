package haday.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 上午11:08:05
 */

@Configuration
@MapperScan(basePackages = "haday.demo.mapper.second", sqlSessionTemplateRef = "secondSqlSessionTemplate")
public class SecondDruidConfig {

	/**
	 * 获取映射文件所在的路径
	 */
	@Value("${mybatis.second.mapper-locations}")
	private String secondMapperPath;

	@Bean(name = "secondDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.second")
	public DataSource setDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "secondTransactionManager")
	public DataSourceTransactionManager setTransactionManager(@Qualifier("secondDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "secondSqlSessionFactory")
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("secondDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(secondMapperPath));
		return bean.getObject();
	}

	@Bean(name = "secondSqlSessionTemplate")
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("secondSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
