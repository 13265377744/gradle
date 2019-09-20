package haday.demo.param;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月20日
 * @time: 上午10:27:12
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParam implements Serializable {

	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = -3290339245389145067L;

	private int pageSize;

	private int pageNum;

	private String order;

	private String sort;

}
