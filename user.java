
package data;

/**
 *
 * @author ponth
 */
class user {
    private int  id;
    private String date;
    private String art_name;
    private int cus_id,art_id,quantity;
    
    public user(int is,String date,String art_name,int art_id,int  cus_id,int  quantity)
    {
        this.id=is;
        this.date=date;
        this.art_name=art_name;
        this.art_id=art_id;
        this.cus_id=cus_id;
        
        this.quantity=quantity;   
    }
    public int getId()
    {
        return  id;
    }
    public  String getDate()
    {
        return date;
    }
    public String getart_name()
    {
        return art_name;
    }
    public  int getart_id()
    {
        return art_id;
    }
    public  int getcus_id()
    {
        return cus_id;
    }
    public int getquantity()
    {
        return quantity;
    }
}
