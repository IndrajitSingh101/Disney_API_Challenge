package com.disney.studios.repository;

import com.disney.studios.entity.VoteDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoteImageRepository extends JpaRepository<VoteDetails,Integer> {
    public VoteDetails findByClientID(String clientID);
}
