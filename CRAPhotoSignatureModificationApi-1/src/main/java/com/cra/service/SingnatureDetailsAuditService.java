package com.cra.service;

import com.cra.Dto.PhotoAndSignatureUpdateDto;
import com.cra.model.SingnatureDetailsAudit;

public interface SingnatureDetailsAuditService {

	SingnatureDetailsAudit save(PhotoAndSignatureUpdateDto PhotoAndSignatureUpdateDto);
}
