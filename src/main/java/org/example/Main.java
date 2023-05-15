package org.example;

import org.example.controller.Controller;
import org.example.model.MainModel;
import org.example.model.Model;
import org.example.view.EditUserView;
import org.example.view.UsersView;


public class Main {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Ivanov", 123l, 3);
        usersView.fireEventShowDeletedUsers();
    }
}