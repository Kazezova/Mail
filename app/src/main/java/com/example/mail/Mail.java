package com.example.mail;

import android.os.Parcel;
import android.os.Parcelable;
public class Mail{
    public static String[] title=new String[]{
            "Aitgul",
            "Aizada",
            "Dias",
            "Ardak",
            "Malika",
            "Kadyrgali"
    };
    public static String[] information=new String[]{
            "Hello, how are you?",
            "I have great news for you.",
            "About the project",
            "Call me",
            "Long time no see",
            "I need your help"
    };
    public static int[] picturePath=new int[]{
            R.drawable.aitgul,
            R.drawable.aizada,
            R.drawable.dias,
            R.drawable.ardak,
            R.drawable.malika,
            R.drawable.kadyrgali
    };
    public static String[] detail=new String[]{
            "Where are you? Lets talk about something",
            "Tomorrow will be the premiere of the film Illusion of Deception 3. And I have an extra ticket for you:)",
            "Soon we need to hand over the web development project, let's meet tomorrow and finish it.",
            "Long time no see and I have accumulated news. Call me I need to tell something",
            "Tomorrow at 2pm I'm waiting for you near Arbat. Do not come, I offended",
            "Recently, I do not understand the theory of probability. Can you please explain, soon the border control"
    };
}
//public class Mail implements Parcelable {
//
//    String name;
//    String mail;
//    int photo;
//    int star;
//    public Mail(String name, String mail, int photo, int star){
//        this.name=name;
//        this.mail=mail;
//        this.photo=photo;
//        this.star=star;
//    }
//    protected Mail(Parcel in) {
//        name = in.readString();
//        mail = in.readString();
//        photo=in.readInt();
//        star=in.readInt();
//    }
//    public static final Creator<Mail> CREATOR = new Creator<Mail>() {
//        @Override
//        public Mail createFromParcel(Parcel in) {
//            return new Mail(in);
//        }
//
//        @Override
//        public Mail[] newArray(int size) {
//            return new Mail[size];
//        }
//    };
//    public String getName() {
//        return name;
//    }
//
//    public String getMail() {
//        return mail;
//    }
//
//    public int getPhoto() {
//        return photo;
//    }
//
//    public int getStar() {
//        return star;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setMail(String mail) {
//        this.mail = mail;
//    }
//
//    public void setPhoto(int photo) {
//        this.photo = photo;
//    }
//
//    public void setStar(int star) {
//        this.star = star;
//    }
//    public int describeContents(){
//        return 0;
//
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(photo);
//        dest.writeString(name);
//        dest.writeString(mail);
//    }
//}
