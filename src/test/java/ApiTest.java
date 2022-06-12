import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ApiTest {

    @Test
    public void status200test() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void test2() {
        RestAssured.baseURI = "https://reqres.in/api";
        RestAssured.given().get("/users?page=2").then().statusCode(200);

    }
    @Test
    public void addTest(){
        int a=5;
        int b=4;
        int expected=9;
        Math math= new Math();
        int result= math.add(a,b);
        Assert.assertEquals(result,expected);
    }
    @Test
    public void addTests(){
        int a=5;
        int b=4;
        int expected=9;
        Math math= new Math();
        int result= math.add(a,b);
        Assert.assertEquals(result,expected);
    }

}