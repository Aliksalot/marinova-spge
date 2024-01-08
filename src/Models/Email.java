package Models;
import Utils.EmailChecker;

public class Email{

  private String email_string;
  
  public Email(String email_string){
    if(!EmailChecker.isValidEmail(email_string)){
      email_string = "";
      return;
    }
    this.email_string = email_string;
  }

  public String getDomain(){
    return email_string.split("@")[1];
  }
  
  public String getEmailName(){
    return email_string.split("@")[0];
  }

  @Override
  public String toString(){
    return email_string;
  }

}
