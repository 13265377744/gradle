package haday.com.service.eneity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月23日
 * @time: 下午5:10:23
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Material implements Serializable {
	/**
	 * @Fields field:field:{todo}
	 */
	private static final long serialVersionUID = 9190563046160557308L;

	/**
	 * 表头物料
	 */
	private String matCode;

	/**
	 * 投入物料
	 */
	private String reqCode;

	/**
	 * 单耗
	 */
	private String unit;

	/**
	 * 月份
	 */
	private String month;

	/**
	 * 本期产量
	 */
	private String output;

	/**
	 * 本期消耗
	 */
	private String consume;

}
