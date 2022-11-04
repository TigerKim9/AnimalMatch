package com.animalmatch.write.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.animalmatch.write.Reply;
import com.animalmatch.write.ReplyDTO;
import com.animalmatch.write.Write;
import com.animalmatch.write.WriteDTO;
import com.animalmatch.write.mapper.WriteMapper;

@Service
public class WriteService implements WriteMapper {

	WriteMapper writeMapper;
	
	@Override
	public int write(Write write) {
		int result = writeMapper.write(write);
		return result;
	}

	@Override
	public List<WriteDTO> writeList() {
		List<WriteDTO> writeList = writeMapper.writeList();
		return writeList;
	}

	@Override
	public WriteDTO viewWrite(Long writeUid) {
		WriteDTO viewWrite = writeMapper.viewWrite(writeUid);
		return viewWrite;
	}

	@Override
	public int updateWrite(Write write) {
		int result = writeMapper.updateWrite(write);
		return result;
	}

	@Override
	public int deleteWrite() {
		int result = writeMapper.deleteWrite();
		return result;
	}

	@Override
	public int reply(Reply reply) {
		int result = writeMapper.reply(reply);
		return result;
	}

	@Override
	public List<ReplyDTO> replyList(Long writeUid) {
		List<ReplyDTO> replyList = writeMapper.replyList(writeUid);
		return replyList;
	}

	@Override
	public int updateReply(Reply reply) {
		int result = writeMapper.updateReply(reply);
		return result;
	}

	@Override
	public int deleteReply() {
		int result = writeMapper.deleteReply();
		return result;
	}
	
	
}
