/**
 * 
 */
package com.ibm.springbootjpa.tutorial;

import org.springframework.data.repository.CrudRepository;

/**
 * @author andressanchez
 *
 */
public interface UserRepository extends CrudRepository<UserRecord, String> {

}
