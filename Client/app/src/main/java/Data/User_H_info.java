package Data;
// 사용자의 신장, 체중, 나이, 활동량, 성별,
public class User_H_info {
    private String userActivity;
    private int userAge;
    private double userHeight, userWeight;
    private boolean userSex; // 성별 남자는 1 여자는 0으로 함.

    public User_H_info() {

    }
    public User_H_info(String userActivity,int userAge, double userHeight, double userWeight , boolean userSex ) {
        this.userActivity =userActivity; this.userAge= userAge; this.userHeight = userHeight; this.userWeight = userWeight;
        this.userSex = userSex;
    }

    public String getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(String userActivity) {
        this.userActivity = userActivity;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public boolean isUserSex() {
        return userSex;
    }

    public void setUserSex(boolean userSex) {
        this.userSex = userSex;
    }
}
