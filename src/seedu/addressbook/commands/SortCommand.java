package seedu.addressbook.commands;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.Tag;

import java.util.HashSet;
import java.util.Set;

public class SortCommand extends Command {
    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Sorts the address book based on names (first priority)." +
            "If users have the same name, sorting will be based on the contact numbers."
            + "Example: " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "AddressBook Sorted!";

    @Override
    public CommandResult execute() {
        addressBook.sortAddressBook();
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
