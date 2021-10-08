/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.business.concretes;

import com.mindBehindCase.mindBehindCase.business.abstracts.APIService;
import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import com.mindBehindCase.mindBehindCase.model.Comments;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author oguz.turkaslan
 */
@Service
public class APIManager implements APIService {

    @Override
    public Result<List<Comments>> getComments() {
        List<Comments> commentsList = new ArrayList<>();
        String url = "https://my-json-server.typicode.com/typicode/demo/comments";
        return new Result<List<Comments>>(commentsList, true, url, url);
    }

}
