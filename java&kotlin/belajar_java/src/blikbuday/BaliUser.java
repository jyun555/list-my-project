package blikbuday;

public class BaliUser {
    private Bali bali;

    public BaliUser(Bali bali){
        this.bali = bali;
    }
    public void getList(){
        this.bali.getList();
    }

    public void setList(){
        this.bali.setList();
    }
}
