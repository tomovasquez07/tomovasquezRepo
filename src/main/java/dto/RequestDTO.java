package dto;

import java.util.Date;

import lombok.Data;

@Data
public class RequestDTO {
	private String name;//氏名
	private int age;//年齢
	private Date joinDate;//入社年月日
	private boolean secondUnit; //2U所属
}
