/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mindBehindCase.mindBehindCase.business.abstracts;

import com.mindBehindCase.mindBehindCase.core.utilities.results.Result;
import com.mindBehindCase.mindBehindCase.model.Comments;
import java.util.List;

/**
 *
 * @author oguz.turkaslan
 */
public interface CommentsService {

    Result<List<Comments>> getComments();
}
