package gradle.master.config;

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
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 上午10:47:41
 */

@Configuration
@MapperScan(basePackages = "haday.demo.mapper.first", sqlSessionTemplateRef = "firstSqlSessionTemplate")
public class FirstDruidConfig {

	/**
	 * 获取映射文件所在的路径
	 */
	@Value("${mybatis.first.mapper-locations}")
	private String firstMapperPath;

	@Bean(name = "firstDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.first")
	@Primary
	public DataSource setDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "firstSqlSessionFactory")
	@Primary
	public SqlSessionFactory setSqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(firstMapperPath));
		return bean.getObject();
	}

	@Bean(name = "firstTransactionManager")
	@Primary
	public DataSourceTransactionManager setTransactionManager(@Qualifier("firstDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "firstSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate setSqlSessionTemplate(
			@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
