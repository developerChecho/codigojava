 public class paypal extends payment{
    String email;
    public paypal (String email,Integer id){
        super(id);
        this.email=email;
        this.id=id;
    }
}