package dto;
import java.util.Date;

import lombok.Data;

@Data
public class ResponseDTO {
	public int no;//社員番号
	public String name;//氏名
	public int age;//年齢
	public 	Date joinDate;//入社年月日
	public boolean secondUnit; //2U所属
}
