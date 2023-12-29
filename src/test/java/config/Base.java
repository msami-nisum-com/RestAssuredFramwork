package config;

public class Base extends APIKey {
    public String baseURI1 = "https://reqres.in";
    public String basePath1= "api/users";
    public String userID1="2";
    public String bodyForPost1 ="{\n" +
            "    \"name\": \"Muhammad Sami Shaikh\",\n" +
            "    \"job\": \"Sr Automation Engineer\"\n" +
            "}";
    public String bodyForPut1 ="{\n" +
            "    \"name\": \"Muhammad Sami Ahmed\",\n" +
            "    \"job\": \"Sr SQA Engineer\"\n" +
            "}";
    public String baseURI2 = "https://api.getpostman.com/";
    public String basePath2 = "workspaces";

    public String body2 = "{\n" +
            "    \"workspace\": {\n" +
            "        \"name\": \"WorkSpace 1\",\n" +
            "        \"description\": \"Test WorkSpace\",\n" +
            "        \"type\": \"personal\"\n" +
            "    }\n" +
            "}";
    public String updateBody2 = "{\n" +
            "    \"workspace\": {\n" +
            // "        \"name\": \"WorkSpace 3s\",\n" +
            "        \"name\": \"abcs\",\n" +
            "        \"type\": \"personal\",\n" +
            //"        \"description\": \"Test WorkSpace With json files\"\n" +
            "        \"description\": \"ABCD\"\n" +
            "    }\n" +
            "}";
    public String contentTypeJSON =  "application/json";
    public String workSpaceId = "9d140690-9c53-43a6-b8e5-5dad38831708";
}
