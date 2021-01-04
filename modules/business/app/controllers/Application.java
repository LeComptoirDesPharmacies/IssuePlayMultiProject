package controllers.business;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {

    public Result index() {
        return ok();
    }

    public Result loaderIo(String token) {
        return ok("loaderio-"+token);
    }

    public Result ping() {
        return ok("App is online!");
    }
}
