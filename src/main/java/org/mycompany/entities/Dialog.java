package org.mycompany.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dialog extends AbstractEntity {
    private List<Message> messages = new ArrayList<>();
    private Set<DialogParticipant> dialogParticipants = new HashSet<>();
    private LocalDateTime created;
    private LocalDateTime modified;

    public List<Message> getMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public Set<DialogParticipant> getDialogParticipants() {
        return dialogParticipants;
    }

    public void addDialogParticipant(DialogParticipant dialogParticipant) {
        this.dialogParticipants.add(dialogParticipant);
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
