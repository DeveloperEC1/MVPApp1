package com.elior.mvpapp;

public class MainActivityPresenter {

    private User user;
    private ViewInterface viewInterface;

    public MainActivityPresenter(ViewInterface viewInterface) {
        this.user = new User();
        this.viewInterface = viewInterface;
    }

    public void updateFullName(String fullName) {
        user.setFullName(fullName);
        viewInterface.updateUserInfoTextView(user.toString());
    }

    public void updateEmail(String email) {
        user.setEmail(email);
        viewInterface.updateUserInfoTextView(user.toString());
    }

}
