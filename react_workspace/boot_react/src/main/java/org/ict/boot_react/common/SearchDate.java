package org.ict.boot_react.common;

import java.sql.Date;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class SearchDate {
	private Date begin;
	private Date end;
}
