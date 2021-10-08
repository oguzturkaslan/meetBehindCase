/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.business.concretes;

import com.mindBehindCase.mindBehindCase.business.abstracts.APIService;
import com.mindBehindCase.mindBehindCase.business.abstracts.CommentsService;
import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import com.mindBehindCase.mindBehindCase.model.Comments;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oguz.turkaslan
 */
@Service
public class CommentsManager implements CommentsService {

    private APIService apiService;

    @Autowired
    public CommentsManager(APIService apiService) {
        this.apiService = apiService;
    }

    @Override
    public Result<List<Comments>> getComments() {
        return apiService.getComments();
    }

}
