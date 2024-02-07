package com.cra.service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.model.SingnatureDetails;

public interface SingnatureDetailsService {

	SingnatureDetails save(PhotoAndSignatureUpdateDto PhotoAndSignatureUpdateDto);
}
