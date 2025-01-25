package Data;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public class DataReader {

        public String FName , LName , EMAIL , PASSWORD , ConPassword;

        public void Reader() throws IOException, ParseException {

            String path =System.getProperty("user.dir")+"\\src\\test\\java\\Data\\UserData.json";
            File srcfile = new File(path);
            org.json.simple.parser.JSONParser parser = new JSONParser();
            JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcfile));

            for(Object yobject : jarray) {

                JSONObject person = (JSONObject) yobject;
                FName=(String) person.get("FirstName");

                LName=(String) person.get("LastName");

                EMAIL=(String) person.get("Email");

                PASSWORD=(String) person.get("PassWord");

                ConPassword=(String) person.get("ConfirmPassWord");

            }
        }
    }

