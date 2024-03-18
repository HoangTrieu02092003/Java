package singleton.vote;

public class Election {
    //Khai báo biến instance
    private static Election instance;
    int trump = 0, joe_biden = 0;
    //Phương thức khởi tạo
    private Election(){
    }
    // Phương thức getInstace để trả về biến instance
    public static Election getInstance() {
        if(instance == null)
            instance = new Election();
        return instance;
    }
    public void vote(Candidate candidate){
        if(candidate == Candidate.BIDEN)
            joe_biden++;
        else if (candidate == Candidate.TRUMP)
            trump++;
    }
    public void inKetQua(){
        System.out.println("Trump: " + trump);
        System.out.println("Joe Biden: " + joe_biden);
    }
}
