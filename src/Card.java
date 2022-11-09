  public class Card extends payment{
     Integer numberCard;
     String  dateCard;
     String  cvv;

      public Card(Integer id, Integer numberCard, String dateCard, String cvv) {
          super(id);
          this.numberCard= numberCard;
          this.cvv=cvv;
          this.dateCard=dateCard;
      }
  }