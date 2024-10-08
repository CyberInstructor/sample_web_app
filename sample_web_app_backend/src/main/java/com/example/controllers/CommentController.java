package com.example.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @PostMapping("/comment")
    public String postComment(@RequestBody CommentRequest commentRequest) {
        // Vulnerable to XSS
        String comment = commentRequest.getComment();
        return "Comment received: " + comment;
    }
}

class CommentRequest {
    private String comment;

    // Getter and Setter
    public String getComment() { return comment; }
    public void setComment(String comment) { this.comment = comment; }
}

