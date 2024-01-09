package Models;

public class Customer implements JSONMapper{

  private String name;
  private Email email;

  public Customer(String name){
    this.name = name; 
    //proverqvame dali ima takuv seivnat, ako nqma suzdavame
  }
  
  public Customer(String name, String email){
    this.name = name; 
    this.email = new Email(email);
    //proverqvame dali ima takuv seivnat, ako nqma suzdavame
  }

  @Override
  public boolean sync(){
    return true;
  }

}