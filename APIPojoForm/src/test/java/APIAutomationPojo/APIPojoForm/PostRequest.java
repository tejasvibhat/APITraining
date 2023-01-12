package APIAutomationPojo.APIPojoForm;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;


public class PostRequest {
	public static void main(String[] args) {
		
		AddressInformation add=new AddressInformation();
		add.setHouseno("526");
		add.setLaneno("2/A");
		add.setAddressType("Temp");
		
		BasicInformation basic=new BasicInformation();
		basic.setFirstName("Shruthi");
		basic.setLastName("Gupta");
		basic.setRole("Developer");
		basic.setId("Shru_002");
		basic.setAddress(add);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(basic)
		.when()
		.post("http://localhost:3000/color");
		
		System.out.println("Status code: "+res.statusCode());
		
	}

}
