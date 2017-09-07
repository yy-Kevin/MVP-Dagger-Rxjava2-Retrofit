package vko.cn.myapplication.module.bean;

/**
 * Created by A on 2017/9/4.
 */

public class UserInfo extends BaseEntity<UserInfo>{
        /**
         * token : dafafafafafadf
         * name : 丁
         * nick : bdceo
         * mobile : 134
         * grade : 2
         * learn : 51
         * bface : http://xxx/……
         * sface : http://xxx/……
         * school : 晏家屯中学
         * sex : 0/1/null
         * udid : 24234234234234
         * uid : 24234234234234
         */
        private String token;
        private String name;
        private String nick;
        private String mobile;
        private String grade;
        private String learn;
        private String bface;
        private String sface;
        private String school;
        private String sex;
        private String udid;
        private String uid;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getLearn() {
            return learn;
        }

        public void setLearn(String learn) {
            this.learn = learn;
        }

        public String getBface() {
            return bface;
        }

        public void setBface(String bface) {
            this.bface = bface;
        }

        public String getSface() {
            return sface;
        }

        public void setSface(String sface) {
            this.sface = sface;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getUdid() {
            return udid;
        }

        public void setUdid(String udid) {
            this.udid = udid;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

}
