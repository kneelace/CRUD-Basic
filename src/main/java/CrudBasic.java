import com.lti.jpacrud.client.StudentClientUI;
import com.lti.jpacrud.exceptions.StudentException;
import com.lti.jpaoto.OTOClient;
import com.lti.jpaoto2.OTOClient2;

public class CrudBasic {

    public static void main(String[] args) throws StudentException {

        String choice = "studentClientUI";

        switch (choice){
            case "studentClientUI":
                StudentClientUI studentClientUI = new StudentClientUI();
                studentClientUI.studentClientUI(args);
                break;

            case "otoMain":
                OTOClient otoMain = new OTOClient();
                otoMain.otoClient(args);
                break;

            case "otoMain2":
                OTOClient2 otoMain2 = new OTOClient2();
                otoMain2.OtoClient2(args);
                break;

            default:
                System.out.println("No wiring done!");


        }




    }
}
