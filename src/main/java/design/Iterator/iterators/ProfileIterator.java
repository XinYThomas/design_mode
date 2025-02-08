package design.Iterator.iterators;

import design.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
