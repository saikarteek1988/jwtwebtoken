/**
 * 
 */
package com.learning.jwtwebtoken.payload;

import javax.validation.constraints.NotNull;

/**
 * @author Shvintech India LLP
 *
 */
public class VoteRequest {
	
	@NotNull
    private Long choiceId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }

}
