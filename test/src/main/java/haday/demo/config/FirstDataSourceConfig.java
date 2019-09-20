package haday.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月19日
 * @time: 下午4:43:13
 */

@Configuration
@MapperScan(basePackages = "haday.demo.mapper.first", sqlSessionTemplateRef = "firstSqlSessionTemplate")
public class FirstDataSourceConfig {

	/**
	 * 获取映射文件所在的路径
	 */
	@Value("${mybatis.first.mapper-locations}")
	private String firstMapperPath;

	/**
	 * @Author jason.tang
	 * @Description: 根据配置文件，注入数据源
	 * @Date: 15:53 2019/2/13
	 * @Param []
	 * @return javax.sql.DataSource
	 */
	@Bean(name = "firstDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.first")
	public DataSource firstDataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * @Author jason.tang
	 * @Description: 注入SqlSessionFactory，指定数据源和映射文件路径
	 * @Date: 15:54 2019/2/13
	 * @Param [dataSource]
	 * @return org.apache.ibatis.session.SqlSessionFactory
	 */
	@Bean(name = "firstSqlSessionFactory")
	@Primary
	public SqlSessionFactory sqlSessionFactory(@Qualifier("firstDataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		Resource[] resources = new PathMatchingResourcePatternResolver().getResources(firstMapperPath);
		sqlSessionFactoryBean.setMapperLocations(resources);
		return sqlSessionFactoryBean.getObject();
	}

	/**
	 * @Author jason.tang
	 * @Description: 注入DataSourceTransactionManager事物管理器
	 * @Date: 15:55 2019/2/13
	 * @Param [dataSource]
	 * @return org.springframework.jdbc.datasource.DataSourceTransactionManager
	 */
	@Bean(name = "firstTransactionManager")
	@Primary
	public DataSourceTransactionManager transactionManager(@Qualifier("firstDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	/**
	 * @Author jason.tang
	 * @Description: 注入SqlSessionTemplate模板
	 * @Date: 15:55 2019/2/13
	 * @Param [sqlSessionFactory]
	 * @return org.mybatis.spring.SqlSessionTemplate
	 */
	@Bean(name = "firstSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate sqlSessionTemplate(
			@Qualifier("firstSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
