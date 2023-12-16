/**
 * 
 */
package tool.tiktok.model;

/**
 * @author dung.nguyenvan1
 *
 */
public class InitUploadSession {

	private Data data;
	private Error error;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public class Data {
		private String publish_id;
		private String upload_url;

		public String getPublish_id() {
			return publish_id;
		}

		public void setPublish_id(String publish_id) {
			this.publish_id = publish_id;
		}

		public String getUpload_url() {
			return upload_url;
		}

		public void setUpload_url(String upload_url) {
			this.upload_url = upload_url;
		}

	}

	public class Error {
		private String code;
		private String message;
		private String log_id;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getLog_id() {
			return log_id;
		}

		public void setLog_id(String log_id) {
			this.log_id = log_id;
		}

	}
}
