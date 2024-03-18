package singleton.vote;

public class User {
    String ten;
    boolean daVote = false;


    public User(String ten) {
        this.ten = ten;
    }
    public void vote(Candidate candidate){
        if (!daVote) {
            Election.getInstance().vote(candidate);
            daVote = true;
        } else {
            System.out.println(ten + " đã vote");
        }
    }
}
