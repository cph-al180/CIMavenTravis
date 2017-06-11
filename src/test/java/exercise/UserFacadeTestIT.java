package exercise;

import exercise.IUserFacade;
import exercise.UserFacadeTest;
import exercise.realdatabase.UserFacadeRealDB;

public class UserFacadeTestIT extends UserFacadeTest {
    @Override
    public IUserFacade makeUserFacade() {
        if (System.getenv("TRAVIS") != null) {
            return new UserFacadeRealDB("pu_mySql_travis_Integration");
        }
        return new UserFacadeRealDB("pu_localDB");
    }
}
