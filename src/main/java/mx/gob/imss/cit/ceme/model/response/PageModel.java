/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gob.imss.cit.ceme.model.response;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author 
 * @param <M>
 */
@Getter @Setter
public class PageModel<M extends Serializable>{
  private List<M> content;
  private Long totalElements;
  private Integer numberOfElements;
  private Integer number;
  private Integer size;
  private Integer totalPages;
}
