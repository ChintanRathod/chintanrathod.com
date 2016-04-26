package chintan.rathod.databindingdemo.adapter;

import android.support.design.widget.Snackbar;
import android.view.View;

import chintan.rathod.databindingdemo.Model.User;

public class UserClickHandler {
    private final User user;

    public UserClickHandler(User user) {
        this.user = user;
    }

    public void onClick(View view) {
        Snackbar.make(view, user.getDisplayName() + " is selected", Snackbar.LENGTH_LONG).show();
    }
}