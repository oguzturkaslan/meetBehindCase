/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.api.controllers;

import com.mindBehindCase.mindBehindCase.business.abstracts.CommentsService;
import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import com.mindBehindCase.mindBehindCase.model.Comments;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oguz.turkaslan
 */
@RestController
public class CommentsController {

    private CommentsService commentsService;

    @Autowired
    public CommentsController(CommentsService commentsService) {
        this.commentsService = commentsService;
    }

    @GetMapping("/getComments")
    public Result<List<Comments>> getComments() {
        return commentsService.getComments();
    }

}
