package Model.BO;

import Model.DAO.CheckLoginDAO;

public class CheckLoginBO {
    CheckLoginDAO checkLoginDAO = new CheckLoginDAO();
    
    public boolean isValidUser(String Username, String Pass){
        return checkLoginDAO.LoginMember(Username, Pass);
    }
    
}
