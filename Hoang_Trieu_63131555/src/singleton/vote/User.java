package singleton.vote;

public class User {
    String ten;

    public User(String ten) {
        this.ten = ten;
    }
    public void vote(Candidate candidate){
        Election.getInstance().vote(candidate);
    }
}
