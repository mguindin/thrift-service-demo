#
# Autogenerated by Thrift Compiler (0.8.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'base_types'


module Job_service
    module JobStatus
      QUEUED = 0
      PENDING = 1
      COMPLETED = 2
      VALUE_MAP = {0 => "QUEUED", 1 => "PENDING", 2 => "COMPLETED"}
      VALID_VALUES = Set.new([QUEUED, PENDING, COMPLETED]).freeze
    end

    class Job
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ID = 1
      CLIENTID = 2
      STARTTIME = 3
      STOPTIME = 4
      TYPE = 5
      STATUS = 6
      TITLE = 7

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRING, :name => 'id'},
        CLIENTID => {:type => ::Thrift::Types::I32, :name => 'clientId'},
        STARTTIME => {:type => ::Thrift::Types::I64, :name => 'startTime'},
        STOPTIME => {:type => ::Thrift::Types::I64, :name => 'stopTime'},
        TYPE => {:type => ::Thrift::Types::STRING, :name => 'type'},
        STATUS => {:type => ::Thrift::Types::I32, :name => 'status', :enum_class => Job_service::JobStatus},
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @status.nil? || Job_service::JobStatus::VALID_VALUES.include?(@status)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field status!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class JobDummy
      include ::Thrift::Struct, ::Thrift::Struct_Union
      JOB = 1
      BLASTID = 2

      FIELDS = {
        JOB => {:type => ::Thrift::Types::STRUCT, :name => 'job', :class => Job_service::Job},
        BLASTID => {:type => ::Thrift::Types::I32, :name => 'blastId'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
