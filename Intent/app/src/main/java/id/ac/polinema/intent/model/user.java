package id.ac.polinema.intent.model;

import android.os.Parcel;
import android.os.Parcelable;

public class user implements Parcelable {
    private String username;
    private String name;
    private int age;


    public user(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }

    protected  user (Parcel in){
                username =in.readString();
                name =in.readString();
                age =in.readInt();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.username);
        dest.writeString(this.name);
        dest.writeInt(this.age);
    }
    public static final Parcelable.Creator<user> CREATOR = new Parcelable.Creator<user>() {
        @Override
        public user createFromParcel(Parcel source) {
            return new user(source);
        }

        @Override
        public user[] newArray(int size) {
            return new user[size];
        }
    };
}
