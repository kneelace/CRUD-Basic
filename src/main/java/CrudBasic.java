import com.lti.jpacrud.client.StudentClientUI;
import com.lti.jpacrud.exceptions.StudentException;
import com.lti.jpaoto.OTOMain;

public class CrudBasic {

    public static void main(String[] args) throws StudentException {

//      StudentClientUI studentClientUI = new StudentClientUI();
//      studentClientUI.studentClientUI(args);

        OTOMain otoMain = new OTOMain();
        otoMain.otoClient(args);


    }
}
