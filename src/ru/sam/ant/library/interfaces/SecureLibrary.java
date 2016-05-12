package ru.sam.ant.library.interfaces;

import ru.sam.ant.library.objects.User;

public interface SecureLibrary {
    boolean login(User user);
    boolean logout(User user);
}
