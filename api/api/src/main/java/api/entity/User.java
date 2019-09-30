package api.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午5:52:52
 */

@Data
@ToString
public class User implements Serializable {
	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 3216051047785963211L;

	private Long id;

	private String guid;

	private String name;

	private String age;

	private Date createTime;

}
