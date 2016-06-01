package com.gss.coms.bargeoperation.controller.partner;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.gss.coms.bargeoperation.model.PartnerInfo;

public class PartnerInfoValidator implements Validator {

	/**
	 * This Validator validates *just* PartnerInfo instances
	 */
	public boolean supports(Class clazz) {
		return PartnerInfo.class.equals(clazz);
	}

	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "code", "field.empty.or.white.space");
		ValidationUtils.rejectIfEmptyOrWhitespace(e, "name", "field.empty.or.white.space");

		PartnerInfo partnerInfo = (PartnerInfo) obj;
		// validate partner code
		if (partnerInfo.getCode().length() > 50) {
			e.rejectValue("code", "field.size.too.long");
		} else if (partnerInfo.getCode().trim().length() != partnerInfo.getCode().length()) {
			e.rejectValue("code", "field.not.starting.ending.white.space");
		}
		// validate partner name
		if (partnerInfo.getName().length() > 100) {
			e.rejectValue("name", "field.size.too.long");
		} else if (partnerInfo.getName().trim().length() != partnerInfo.getName().length()) {
			e.rejectValue("name", "field.not.starting.ending.white.space");
		}
	}

}
