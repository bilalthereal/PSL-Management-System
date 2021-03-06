USE [master]
GO
/****** Object:  Database [PSL]    Script Date: 6/8/2020 8:37:31 PM ******/
CREATE DATABASE [PSL]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PSL', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PSL.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PSL_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PSL_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [PSL] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PSL].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PSL] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PSL] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PSL] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PSL] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PSL] SET ARITHABORT OFF 
GO
ALTER DATABASE [PSL] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PSL] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PSL] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PSL] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PSL] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PSL] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PSL] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PSL] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PSL] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PSL] SET  ENABLE_BROKER 
GO
ALTER DATABASE [PSL] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PSL] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PSL] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PSL] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PSL] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PSL] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PSL] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PSL] SET RECOVERY FULL 
GO
ALTER DATABASE [PSL] SET  MULTI_USER 
GO
ALTER DATABASE [PSL] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PSL] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PSL] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PSL] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [PSL] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'PSL', N'ON'
GO
ALTER DATABASE [PSL] SET QUERY_STORE = OFF
GO
USE [PSL]
GO
/****** Object:  Table [dbo].[AirLine]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AirLine](
	[Seat_No] [int] NOT NULL,
	[Player_Name] [varchar](50) NULL,
	[Phone_No] [bigint] NULL,
	[AirPort_Name_City] [varchar](50) NULL,
	[AirLine_Company_Name] [varchar](50) NULL,
	[_From] [varchar](50) NULL,
	[_To] [varchar](50) NULL,
	[Flight_Date] [date] NULL,
	[Departure_Time] [varchar](50) NULL,
	[Arrival_Time] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[Seat_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[BidSold]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[BidSold](
	[Season_Id] [varchar](15) NOT NULL,
	[Team_Id] [varchar](15) NOT NULL,
	[Player_Id] [varchar](15) NOT NULL,
	[Category] [varchar](15) NOT NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[categoryId] [varchar](15) NOT NULL,
	[categoryName] [varchar](30) NULL,
	[price] [bigint] NULL,
	[year] [varchar](15) NULL,
 CONSTRAINT [PK_Category] PRIMARY KEY CLUSTERED 
(
	[categoryId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CreateAccount]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CreateAccount](
	[DesignationID] [int] NOT NULL,
	[password] [nvarchar](25) NOT NULL,
	[username] [nvarchar](25) NOT NULL,
	[Emp_ID] [nvarchar](20) NOT NULL,
 CONSTRAINT [designation_ID] PRIMARY KEY CLUSTERED 
(
	[Emp_ID] ASC,
	[DesignationID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY],
UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Designation]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Designation](
	[id] [int] NOT NULL,
	[DesignationName] [varchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[id] [nvarchar](20) NOT NULL,
	[Name] [varchar](20) NULL,
	[Mail] [nvarchar](40) NULL,
	[Phone_NO] [bigint] NULL,
	[CNIC] [bigint] NULL,
	[DOB] [date] NULL,
	[Designation_ID] [int] NULL,
	[Nationality] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatchShedule]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatchShedule](
	[MatchId] [varchar](15) NOT NULL,
	[date] [varchar](30) NULL,
	[time] [varchar](15) NULL,
	[TossWon_Team_ID] [varchar](15) NULL,
	[StadiumId] [varchar](15) NULL,
	[MatchType] [varchar](30) NULL,
	[TossWon] [varchar](15) NULL,
	[VictoryMargin] [varchar](30) NULL,
	[MatchName] [varchar](50) NULL,
 CONSTRAINT [PK__MatchShe__5E273180C04A0BD4] PRIMARY KEY CLUSTERED 
(
	[MatchId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Nationality]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Nationality](
	[id] [int] NOT NULL,
	[Name] [varchar](25) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Owner]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Owner](
	[Owner_Id] [int] NOT NULL,
	[Name] [varchar](25) NULL,
	[Mail] [nvarchar](25) NULL,
	[Phone_No] [bigint] NULL,
	[CNIC] [bigint] NULL,
	[DOB] [date] NULL,
	[Nationality] [int] NULL,
 CONSTRAINT [PK__Owner__BD6352BBEE88A8DA] PRIMARY KEY CLUSTERED 
(
	[Owner_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[player]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[player](
	[Playerid] [varchar](15) NOT NULL,
	[Name] [varchar](15) NULL,
	[Mail] [varchar](15) NULL,
	[dob] [date] NULL,
	[contact] [varchar](15) NULL,
	[Nationality] [varchar](15) NULL,
	[Category] [varchar](15) NULL,
	[status] [varchar](15) NULL,
 CONSTRAINT [PK__player__4A4F48E06C24A7C0] PRIMARY KEY CLUSTERED 
(
	[Playerid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PointsTable]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PointsTable](
	[TeamId] [varchar](15) NULL,
	[NumberWins] [int] NULL,
	[NumberLoss] [int] NULL,
	[Points] [int] NULL,
	[Drawn] [int] NULL,
	[NoResult] [int] NULL,
	[NetRunRate] [float] NULL,
	[SeasonId] [varchar](15) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[Player_ID] [int] NOT NULL,
	[Player_Name] [varchar](50) NULL,
	[Hotel_Name] [varchar](50) NULL,
	[Area] [varchar](50) NULL,
	[Room_No] [int] NULL,
	[Giving_date] [date] NULL,
	[Rent_per_night] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Player_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ScoreCard]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ScoreCard](
	[Team_id] [varchar](15) NOT NULL,
	[Match_id] [varchar](15) NOT NULL,
	[Player_idone] [varchar](15) NULL,
	[runsScored] [int] NULL,
	[Innings] [varchar](20) NULL,
	[OutBy_playerid] [varchar](15) NULL,
	[OutType] [varchar](15) NULL,
	[runs_conceed] [int] NULL,
	[oversBolwed] [float] NULL,
	[No_wides] [int] NULL,
	[No_NoBalls] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Season]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Season](
	[seasonId] [varchar](15) NOT NULL,
	[seasonName] [varchar](30) NULL,
	[seasonYear] [varchar](30) NULL,
PRIMARY KEY CLUSTERED 
(
	[seasonId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stadium]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stadium](
	[StadiumId] [varchar](15) NOT NULL,
	[Name] [varchar](30) NULL,
	[founded_Date] [varchar](15) NULL,
	[capacity] [int] NULL,
	[foundedBy] [varchar](30) NULL,
 CONSTRAINT [PK__Stadium__ED833058DBBFE7EB] PRIMARY KEY CLUSTERED 
(
	[StadiumId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Stadiums]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Stadiums](
	[S_id] [int] NOT NULL,
	[Stadium_Name] [varchar](50) NULL,
	[Stadium_Area] [varchar](50) NULL,
	[Stadium_Address] [varchar](50) NULL,
	[Stadium_Capacity] [int] NULL,
	[Stadium_Opened] [date] NULL,
	[Stadium_Owner] [varchar](50) NULL,
	[Phone_Number] [bigint] NULL,
PRIMARY KEY CLUSTERED 
(
	[S_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Team]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Team](
	[TeamId] [varchar](15) NOT NULL,
	[Name] [varchar](30) NULL,
	[founded_date] [varchar](30) NULL,
	[Mail] [nvarchar](25) NULL,
	[conatct] [bigint] NULL,
	[Owner_Id] [int] NULL,
 CONSTRAINT [PK_Team] PRIMARY KEY CLUSTERED 
(
	[TeamId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TeamMatch]    Script Date: 6/8/2020 8:37:31 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TeamMatch](
	[TeamAId] [varchar](15) NULL,
	[TeamBId] [varchar](15) NULL,
	[seasonId] [varchar](15) NULL,
	[MatchId] [varchar](15) NULL
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[BidSold]  WITH CHECK ADD  CONSTRAINT [FK_BidSold_Category] FOREIGN KEY([Category])
REFERENCES [dbo].[Category] ([categoryId])
GO
ALTER TABLE [dbo].[BidSold] CHECK CONSTRAINT [FK_BidSold_Category]
GO
ALTER TABLE [dbo].[BidSold]  WITH CHECK ADD  CONSTRAINT [FK_BidSold_player] FOREIGN KEY([Player_Id])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[BidSold] CHECK CONSTRAINT [FK_BidSold_player]
GO
ALTER TABLE [dbo].[BidSold]  WITH CHECK ADD  CONSTRAINT [FK_BidSold_Season] FOREIGN KEY([Season_Id])
REFERENCES [dbo].[Season] ([seasonId])
GO
ALTER TABLE [dbo].[BidSold] CHECK CONSTRAINT [FK_BidSold_Season]
GO
ALTER TABLE [dbo].[BidSold]  WITH CHECK ADD  CONSTRAINT [FK_BidSold_Team] FOREIGN KEY([Team_Id])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[BidSold] CHECK CONSTRAINT [FK_BidSold_Team]
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([DesignationID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([DesignationID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([DesignationID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([Emp_ID])
REFERENCES [dbo].[Employee] ([id])
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([Emp_ID])
REFERENCES [dbo].[Employee] ([id])
GO
ALTER TABLE [dbo].[CreateAccount]  WITH CHECK ADD FOREIGN KEY([Emp_ID])
REFERENCES [dbo].[Employee] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Designation_ID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Designation_ID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Designation_ID])
REFERENCES [dbo].[Designation] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[MatchShedule]  WITH CHECK ADD  CONSTRAINT [FK__MatchShed__Stadi__797309D9] FOREIGN KEY([StadiumId])
REFERENCES [dbo].[Stadium] ([StadiumId])
GO
ALTER TABLE [dbo].[MatchShedule] CHECK CONSTRAINT [FK__MatchShed__Stadi__797309D9]
GO
ALTER TABLE [dbo].[MatchShedule]  WITH CHECK ADD  CONSTRAINT [FK__MatchShed__TossW__787EE5A0] FOREIGN KEY([TossWon_Team_ID])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[MatchShedule] CHECK CONSTRAINT [FK__MatchShed__TossW__787EE5A0]
GO
ALTER TABLE [dbo].[MatchShedule]  WITH CHECK ADD  CONSTRAINT [FK_MatchShedule_Team] FOREIGN KEY([TossWon])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[MatchShedule] CHECK CONSTRAINT [FK_MatchShedule_Team]
GO
ALTER TABLE [dbo].[Owner]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[Owner]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[Owner]  WITH CHECK ADD FOREIGN KEY([Nationality])
REFERENCES [dbo].[Nationality] ([id])
GO
ALTER TABLE [dbo].[player]  WITH CHECK ADD  CONSTRAINT [FK_player_Category] FOREIGN KEY([Category])
REFERENCES [dbo].[Category] ([categoryId])
GO
ALTER TABLE [dbo].[player] CHECK CONSTRAINT [FK_player_Category]
GO
ALTER TABLE [dbo].[PointsTable]  WITH CHECK ADD  CONSTRAINT [FK_PointsTable_Season] FOREIGN KEY([SeasonId])
REFERENCES [dbo].[Season] ([seasonId])
GO
ALTER TABLE [dbo].[PointsTable] CHECK CONSTRAINT [FK_PointsTable_Season]
GO
ALTER TABLE [dbo].[PointsTable]  WITH CHECK ADD  CONSTRAINT [FK_PointsTable_Team] FOREIGN KEY([TeamId])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[PointsTable] CHECK CONSTRAINT [FK_PointsTable_Team]
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Match_id])
REFERENCES [dbo].[MatchShedule] ([MatchId])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Match_id])
REFERENCES [dbo].[MatchShedule] ([MatchId])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Match_id])
REFERENCES [dbo].[MatchShedule] ([MatchId])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([OutBy_playerid])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([OutBy_playerid])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([OutBy_playerid])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Player_idone])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Player_idone])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Player_idone])
REFERENCES [dbo].[player] ([Playerid])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Team_id])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Team_id])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[ScoreCard]  WITH CHECK ADD FOREIGN KEY([Team_id])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[Team]  WITH CHECK ADD  CONSTRAINT [FK__Team__Owner_Id__619B8048] FOREIGN KEY([Owner_Id])
REFERENCES [dbo].[Owner] ([Owner_Id])
GO
ALTER TABLE [dbo].[Team] CHECK CONSTRAINT [FK__Team__Owner_Id__619B8048]
GO
ALTER TABLE [dbo].[TeamMatch]  WITH CHECK ADD  CONSTRAINT [FK_TeamMatch_MatchShedule1] FOREIGN KEY([MatchId])
REFERENCES [dbo].[MatchShedule] ([MatchId])
GO
ALTER TABLE [dbo].[TeamMatch] CHECK CONSTRAINT [FK_TeamMatch_MatchShedule1]
GO
ALTER TABLE [dbo].[TeamMatch]  WITH CHECK ADD  CONSTRAINT [FK_TeamMatch_Season] FOREIGN KEY([seasonId])
REFERENCES [dbo].[Season] ([seasonId])
GO
ALTER TABLE [dbo].[TeamMatch] CHECK CONSTRAINT [FK_TeamMatch_Season]
GO
ALTER TABLE [dbo].[TeamMatch]  WITH CHECK ADD  CONSTRAINT [FK_TeamMatch_Team] FOREIGN KEY([TeamAId])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[TeamMatch] CHECK CONSTRAINT [FK_TeamMatch_Team]
GO
ALTER TABLE [dbo].[TeamMatch]  WITH CHECK ADD  CONSTRAINT [FK_TeamMatch_Team1] FOREIGN KEY([TeamBId])
REFERENCES [dbo].[Team] ([TeamId])
GO
ALTER TABLE [dbo].[TeamMatch] CHECK CONSTRAINT [FK_TeamMatch_Team1]
GO
USE [master]
GO
ALTER DATABASE [PSL] SET  READ_WRITE 
GO


